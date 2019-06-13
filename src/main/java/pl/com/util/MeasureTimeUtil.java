package pl.com.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.Instant;

/**
 * @author Mateusz Nowakowski.
 */
public class MeasureTimeUtil {

  private static final Logger LOGGER = LoggerFactory.getLogger(MeasureTimeUtil.class);

  private MeasureTimeUtil() {

  }

  public static Instant startTimeMeasurement() {

    return Instant.now();
  }

  public static void calculateAndLogDurationTime(Instant start, String place) {

    Instant finish = Instant.now();
    long timeElapsed = Duration.between(start, finish).toMillis();
    LOGGER.info("Duration time for {}: {} ms.", place ,timeElapsed);
  }

}