//package org.example;
//
//public class DemoOCA3 {
//     class Vehicle{
//        String type = "4W";
//        int maxSpeed = 100;
//        Vehicle(String type,int maxSpeed){
//            this.type = type;
//            this.maxSpeed = maxSpeed;
//        }
//    }
//    class Car extends Vehicle{
//         String trans;
//         Car(String trans){
//             this.trans = trans; //line n1 (wrong because of this constructor must have keyword "super")
//         }
//         Car(String type,int maxSpeed,String trans){
//             super(type, maxSpeed);
//             this(trans);//line n2 (wrong because of this() is a constructor, they cant not be at the same level)
//         }
//    }
//}
