package LocalRepo.Workshop;

import java.util.List;

public class Undergraduate extends Student {
    public Undergraduate(String name, int id) {
        super(name, id);
    }

    public Undergraduate(String name, int id, List<Course> electives) {
        super(name, id, electives);
    }
}

