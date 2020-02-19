package net.talaatharb.projecteuler100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DAG {
	private final Map<Integer, List<Edge>> adjecencyMap;

	public DAG() {
		adjecencyMap = new HashMap<>();
	}

	/**
	 * Adding Edge to graph
	 * 
	 * @param fromNode
	 * @param toNode
	 * @param weight
	 */
	public void addEdge(final int fromNode, final int toNode, final int weight) {
		if (!adjecencyMap.containsKey(fromNode)) {
			adjecencyMap.put(fromNode, new ArrayList<>());
		}
		adjecencyMap.get(fromNode).add(new Edge(toNode, weight));
	}

	public int longestDistanceFromSourceToDestination() {
		// Initializing the distances
		final Map<Integer, Integer> distances = new HashMap<>();
		final List<Integer> sort = topologicalSort();
		for (Integer i : sort) {
			distances.put(i, -1000); // -1000 small negative number representing -INF
		}
		final int n = sort.size() - 1;
		distances.put(n, 0);

		for (int i = (n - 1); i > -1; i--) {
			final List<Edge> connectedEdges = adjecencyMap.get(i);
			for (Edge j : connectedEdges) {
				final int temp_distance = distances.get(j.toNode) + j.weight;
				if (temp_distance > distances.get(i)) {
					distances.put(i, temp_distance);
				}
			}
		}
		return distances.get(0);
	}

	/**
	 * Get a topological sort of the graph
	 * 
	 * @return A list of node IDs in a topological sort
	 */
	public List<Integer> topologicalSort() {
		// No need to consider the general case using Kahn's algorithm,
		// since the order of adding edges results in a topological sort from source to
		// destination

		final int n = adjecencyMap.size();
		final List<Integer> sort = new ArrayList<>();
		for (int i = 0; i < (n + 1); i++) {
			sort.add(i);
		}
		return sort;
	}
}

class Edge {
	public final int toNode;
	public final int weight;

	public Edge(final int toNode, final int weight) {
		this.toNode = toNode;
		this.weight = weight;
	}
}

/**
 * P018
 * 
 * @author mharb
 *
 */
public class P018 extends Solution {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P018().run();
	}

	private DAG readGraph(final String fileName) {

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		final List<String> lines = new ArrayList<>();
		InputStreamReader streamReader = new InputStreamReader(classLoader.getResourceAsStream(fileName));
		BufferedReader reader = new BufferedReader(streamReader);
		try {
			for (String line; (line = reader.readLine()) != null;) {
				lines.add(line);
			}
			reader.close();
			streamReader.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		final int n = lines.size();
		final int endNodeIndex = n * (n + 1) / 2 + 1;
		final DAG graph = new DAG();

		Integer[] oldLine = { 0 };
		for (int i = 0; i < n; i++) {
			final String[] parts = lines.get(i).split(" ");
			final List<Integer> newLine = new ArrayList<>();
			for (int j = (i * (i + 1) / 2 + 1); j < ((i + 1) * (i + 2) / 2 + 1); j++) {
				newLine.add(j);
			}
			for (int j = 0; j < oldLine.length; j++) {
				if (parts.length == 1) {
					graph.addEdge(oldLine[j], newLine.get(0), Integer.parseInt(parts[0]));
				} else {
					for (int k = j; k < (j + 2); k++) {
						graph.addEdge(oldLine[j], newLine.get(k), Integer.parseInt(parts[k]));
					}
				}
			}
			oldLine = newLine.toArray(new Integer[0]);
		}
		for (int i : oldLine) {
			graph.addEdge(i, endNodeIndex, 0);
		}

		return graph;
	}

	@Override
	public Number solve() {
		problemNumber = 18;
		final DAG graph = readGraph("p018.txt");
		return graph.longestDistanceFromSourceToDestination();
	}

}