import java.util.*;

public class LocationGraph {

    private final Map<Location, List<Location>> adjList;

    public LocationGraph() {
        this.adjList = new HashMap<>();
    }

    public void addEdge(Location from, Location to) {
        adjList.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
        adjList.computeIfAbsent(to, k -> new ArrayList<>()).add(from);
    }

    public boolean isConnected() {
        if (adjList.isEmpty()) return true;

        Set<Location> visited = new HashSet<>();
        Location startNode = adjList.keySet().iterator().next();
        dfs(startNode, visited);
        return visited.size() == adjList.size();

    }

    public List<Location> getAdj(Location location){
        return adjList.getOrDefault(location, Collections.emptyList());
    }

    private void dfs(Location from, Set<Location> visited) {

        visited.add(from);

        for (Location neighbor : adjList.getOrDefault(from, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited);
            }
        }
    }

    public void printGraph() {
        for(Location location : adjList.keySet()) {
            System.out.println(location + " -> " + adjList.get(location));
        }
    }

}
