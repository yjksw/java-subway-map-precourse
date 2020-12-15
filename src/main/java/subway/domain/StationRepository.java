package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StationRepository {
    private static final List<Station> stations = new ArrayList<>();

    public static List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public static void addStation(Station station) {
        stations.add(station);
    }

    public static boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }

    public static boolean findByName(String name) {
        return stations.stream().anyMatch(station -> station.getName().equals(name));
    }

    public static Station findStationByName(String name) {
        return stations.stream().filter(station ->
                station.getName().equals(name)).findAny().orElse(null);
    }
}
