package jrr.stream;

public class Service {
    public void validateCapacityRoom(Lecturer lecturer, Integer initCapacity) {
        var room = lecturer.getRooms().stream()
                .filter(it -> it.getCapacity() <= initCapacity)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Cannot set  " + initCapacity + " in rooms"));
        room.setCapacity(initCapacity);
    }
}
