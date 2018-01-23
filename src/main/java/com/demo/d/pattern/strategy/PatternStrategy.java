package com.demo.d.pattern.strategy;

/**
 * 策略模式
 */

public class PatternStrategy {

    public static void process(Processor p, Object o) {
        System.out.println(p.process(o));
    }

    public static String s = "策略模式";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    String process(Object input) {
        return input+" class Upcase";
    }
}

class Downcase extends Processor {
    String process(Object input) {
        return input+" class Downcase";
    }
}

class Splitter extends Processor {
    String process(Object input) {
        return input+" class Splitter";
    }
}
