package com.tage.spring.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Thread)
public class JMHFirstBenchmark {
  @Benchmark//对要被测试性能的代码添加注解，说明该方法是要被测试性能的
  public int sleepAWhile() {
    try {
      Thread.sleep(50);
    } catch (InterruptedException e) {
      // ignore
    }
    return 0;
  }

  public static void main(String[] args) throws RunnerException {
    Options opt = new OptionsBuilder()
        .include(JMHFirstBenchmark.class.getSimpleName())
        .forks(10)
        .warmupIterations(3)
        .measurementIterations(30)
        .build();

    new Runner(opt).run();
  }

}
