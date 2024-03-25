import static org.junit.jupiter.api.Assertions.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class SimpleFailingTest {

  private static final Logger log = LogManager.getLogger ();

  @Test
  void test () {
    log.warn ("Just some warning");
    log.error ("This error has {} parameter.", 1);
    fail ("Not yet implemented");
  }

}
