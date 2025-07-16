package LocalRepo.Day2_StackQueueHashmapHashfunction;

class PetrolPump {
    int petrol;
    int distance;

    public PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

public class CircularTour {

    public static int findStartPoint(PetrolPump[] pumps) {
        int totalPetrol = 0, totalDistance = 0;
        int start = 0, currentPetrol = 0;

        for (int i = 0; i < pumps.length; i++) {
            totalPetrol += pumps[i].petrol;
            totalDistance += pumps[i].distance;

            currentPetrol += pumps[i].petrol - pumps[i].distance;
            if (currentPetrol < 0) {
                start = i + 1;
                currentPetrol = 0;
            }
        }

        return (totalPetrol >= totalDistance) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };

        int startPoint = findStartPoint(pumps);
        if (startPoint != -1)
            System.out.println("Start at petrol pump: " + startPoint);
        else
            System.out.println("No possible tour");
    }
}

