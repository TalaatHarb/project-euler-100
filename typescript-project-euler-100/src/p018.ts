import { readFileSync } from "fs";
import { Solution } from "./Solution";

export class P018 extends Solution {

    readGraph(fileName: string): DAG {

        const file = readFileSync(fileName, 'utf-8');
        const lines = file.split('\n');

        const n = lines.length;
        const endNodeIndex = n * (n + 1) / 2 + 1;
        const graph = new DAG();

        let oldLine: number[] = [0];
        for (let i = 0; i < n; i++) {
            const parts = lines[i].split(" ");
            const newLine: number[] = [];
            for (let j = (i * (i + 1) / 2 + 1); j < ((i + 1) * (i + 2) / 2 + 1); j++) {
                newLine.push(j);
            }
            for (let j = 0; j < oldLine.length; j++) {
                if (parts.length == 1) {
                    graph.addEdge(oldLine[j], newLine[0], Number(parts[0]));
                } else {
                    for (let k = j; k < (j + 2); k++) {
                        graph.addEdge(oldLine[j], newLine[k], Number(parts[k]));
                    }
                }
            }
            oldLine = [...newLine];
        }
        for (const i of oldLine) {
            graph.addEdge(i, endNodeIndex, 0);
        }

        return graph;
    }

    solve() {
        this.problemNumber = 18;

        const graph = this.readGraph("p018.txt");
		return graph.longestDistanceFromSourceToDestination();
    }
}

class Edge {
    public toNode: number;
    public weight: number;

    constructor(toNode: number, weight: number) {
        this.toNode = toNode;
        this.weight = weight;
    }
}

class DAG {
    private adjecencyMap: Map<number, Edge[]>;

    constructor() {
        this.adjecencyMap = new Map<number, Edge[]>();
    }

    /**
     * Adding Edge to graph
     * 
     * @param fromNode
     * @param toNode
     * @param weight
     */
    public addEdge(fromNode: number, toNode: number, weight: number) {
        if (!this.adjecencyMap.has(fromNode)) {
            this.adjecencyMap.set(fromNode, []);
        }
        (this.adjecencyMap.get(fromNode) as Edge[]).push(new Edge(toNode, weight));
    }

    longestDistanceFromSourceToDestination(): number {
        // Initializing the distances
        const distances: Map<number, number> = new Map<number, number>();
        const sort = this.topologicalSort();
        for (const i of sort) {
            distances.set(i, -1000); // -1000 small negative number representing -INF
        }
        const n = sort.length - 1;
        distances.set(n, 0);

        for (let i = (n - 1); i > -1; i--) {
            const connectedEdges = this.adjecencyMap.get(i) as Edge[];
            for (const j of connectedEdges) {
                const temp_distance = (distances.get(j.toNode) as number) + j.weight;
                if (temp_distance > (distances.get(i) as number)) {
                    distances.set(i, temp_distance);
                }
            }
        }
        return distances.get(0) as number;
    }

    /**
     * Get a topological sort of the graph
     * 
     * @return A list of node IDs in a topological sort
     */
    public topologicalSort(): number[] {
        // No need to consider the general case using Kahn's algorithm,
        // since the order of adding edges results in a topological sort from source to
        // destination

        const n = this.adjecencyMap.size;
        const sort: number[] = [];
        for (let i = 0; i < (n + 1); i++) {
            sort.push(i);
        }
        return sort;
    }
}
