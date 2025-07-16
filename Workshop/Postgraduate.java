package LocalRepo.Workshop;

import java.util.List;

public class Postgraduate extends Student {
    public Postgraduate(String name, int id) {
        super(name, id);
    }

    public Postgraduate(String name, int id, List<Course> electives) {
        super(name, id, electives);
    }
}

