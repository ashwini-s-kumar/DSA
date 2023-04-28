package com.topicwise.deque.medium;

public class CircularTourPetrolPump {

    static class PetrolPump{
        int distance;
        int petrol;

        public PetrolPump(int petrol, int distance) {
            this.distance = distance;
            this.petrol = petrol;
        }
    }

    public static int startingPrteolPump(PetrolPump [] arr)
    {
        int n = arr.length;
        int start = 0;
        int end = 1;
        int cur_petrol = arr[start].petrol - arr[start].distance;
        while(end != start || cur_petrol < 0) {

            System.out.println("start = " + start +" , end ="+ end +" , cur_petrol =" + cur_petrol);
            while(start != end && cur_petrol < 0){
                System.out.println(start +" cannot be the starting pump , so setting start to next pump");

                cur_petrol -= arr[start].petrol - arr[start].distance;
                start = (start + 1) % n; // start is the next petrol pump

                if(start == 0){
                    System.out.print("Reached 0th pump again, without  petrol to start.");
                    return -1;
                }
            }
            cur_petrol += arr[end].petrol - arr[end].distance;
            end = (end + 1) % n;

        }
        return start;
    }

    public static void main(String [] arr){
        PetrolPump [] pumps = {new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)};
        int start = startingPrteolPump(pumps);

        System.out.println(start == -1 ? "No Solution" : "Start = " + start);
    }
}
