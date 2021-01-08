package com.example.algorithm.practicetruck;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class practice {
    public static void main(String[] args) {
//        System.out.println(bad_solution(120, 20, new int[] {6,8,3,7,5,3,2}));
//        System.out.println(solution(120, 20, new int[] {6,8,3,7,5,3,2}));
    }

//    public static int solution(int bridge_length, int weight, int[] truck_weights) {
//        Queue<Truck> waitTruck = new LinkedList<>();
//        Queue<Truck> runTruck = new LinkedList<>();
//        int totalWeight = 0;
//        int resultCount = 0;
//        int targetTruck = 0;
//
//        for (int truck_weight : truck_weights) {
//
//        }
//
//        while (true) {
//            int truck_weight = truck_weights[targetTruck];
//            if (truck_weight + totalWeight <= weight) {
//                resultCount++;
//                targetTruck++;
//
//                for (Truck truck : trucks) {
//                    truck.run();
//                }
//                trucks.add(new Truck(truck_weight, bridge_length - 1));
//            } else {
//                Truck truck = trucks.get(0);
//                int length = truck.getLength();
//                resultCount += length;
//                truck.moveLength(length);
//            }
//        }
//    }
//
//    public static int bad_solution(int bridge_length, int weight, int[] truck_weights) {
//        int resultCount = 0;
//        List<Truck> onBridge = new LinkedList<>();
//        int totalWeightOnBridge = 0;
//
//        int truckCount = 0;
//        while(truckCount < truck_weights.length) {
//            resultCount++;
//
//            int truck_weight = truck_weights[truckCount];
//
//            for (int i = 0; i < onBridge.size(); i++) {
//                Truck truck = onBridge.get(i);
//                if (truck.run() == bridge_length) {
//                    onBridge.remove(i);
//                    totalWeightOnBridge -= truck.getWeight();
//                    i--;
//                }
//            }
//
//            if (totalWeightOnBridge + truck_weight <= weight) {
//                onBridge.add(new Truck(truck_weight));
//
//                totalWeightOnBridge += truck_weight;
//                truckCount++;
//            }
//        }
//        return resultCount;
//    }
//
//    public static class Truck {
//        int weight;
//        int length;
//
//        public Truck(int weight, int length) {
//            this.weight = weight;
//            this.length = length;
//        }
//
//        public void run() {
//            length--;
//        }
//
//        public int getWeight() {
//            return weight;
//        }
//
//        public int getLength() {
//            return length;
//        }
//
//        public int moveLength(int length) {
//            return this.length - length;
//        }
//    }
}
