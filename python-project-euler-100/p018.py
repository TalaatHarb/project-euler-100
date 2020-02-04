import time
import math


class Edge:
    def __init__(self, to_node, weight):
        super().__init__()
        self.to_node = to_node
        self.weight = weight


class DAG:
    def __init__(self):
        super().__init__()
        self.adjecency_dict = {}

    def add_edge(self, from_node, to_node, weight):
        if from_node not in self.adjecency_dict:
            self.adjecency_dict[from_node] = []
        self.adjecency_dict[from_node].append(Edge(to_node, weight))
        return self

    def topological_sort(self):
        # No need to consider the general case using Kahn's algorithm,
        # since the order of adding edges results in a topological sort from source to destination

        sort = list(self.adjecency_dict.keys())
        sort.append(len(sort))
        return sort

    def longest_path_length_0_end(self):
        # Initializing the distances
        distances = {}
        sort = self.topological_sort()
        for i in sort:
            distances[i] = -1000 # small negative number representing -INF
        distances[sort[-1]] = 0

        n = len(sort) - 1
        for i in range(n - 1, -1, -1):
            connected_edges = self.adjecency_dict[i]
            for j in connected_edges:
                temp_distance = distances[j.to_node] + j.weight
                if temp_distance > distances[i]:
                    distances[i] = temp_distance
        return distances[0]


def read_graph(file_name):
    lines = []
    with open(file_name) as file_in:
        for line in file_in:
            lines.append(line)
    
    n = len(lines)
    end_node_index = n * (n + 1) // 2 + 1
    graph = DAG()

    old_line = [0]
    for i in range(0, n):
        parts = list(map(lambda part: int(part), lines[i].split(' ')))
        new_line = range(i*(i+1)//2 + 1, (i+1)*(i+2)//2 + 1)
        for j in range(0, len(old_line)):
            if len(parts) == 1:
                graph.add_edge(old_line[j], new_line[0], parts[0])
            else:
                for k in range(j, j + 2):
                    graph.add_edge(old_line[j], new_line[k], parts[k])

        old_line = new_line

    for i in old_line:
        graph.add_edge(i, end_node_index, 0)

    return graph


def run():
    start_time = time.time()

    graph = read_graph('p018.txt')
    total = graph.longest_path_length_0_end()

    total_time = time.time() - start_time
    print('p018:', total, '->', total_time, 's')


run()
