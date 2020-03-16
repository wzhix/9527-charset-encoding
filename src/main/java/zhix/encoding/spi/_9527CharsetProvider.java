package zhix.encoding.spi;

import lombok.extern.slf4j.Slf4j;
import sun.nio.cs.AbstractCharsetProvider;

@Slf4j
public class _9527CharsetProvider extends AbstractCharsetProvider {

  static final String CANONICAL_NAME = "9527";
  static final String[] ALIASES = {"mew", "mew-9527"};

  private boolean initialized = false;

  public _9527CharsetProvider() {
    super("zhix.encoding.spi");
  }

  @Override
  protected void init() {
    if (initialized) {
      return;
    }
    super.init();
    log.info("{} initialized.", getClass().getName());

    charset(CANONICAL_NAME, _9527Charset.class.getSimpleName(), ALIASES);
    log.info(
        "Register charset {} with class {}.", CANONICAL_NAME, _9527Charset.class.getName());

    initialized = true;
  }
}
