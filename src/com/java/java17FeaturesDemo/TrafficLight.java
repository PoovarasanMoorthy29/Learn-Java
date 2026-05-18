package com.java.java17FeaturesDemo;

sealed  public class TrafficLight permits red,black,green {

}
final class red extends TrafficLight{

}
final class black extends TrafficLight{

}
final class green extends TrafficLight{

}