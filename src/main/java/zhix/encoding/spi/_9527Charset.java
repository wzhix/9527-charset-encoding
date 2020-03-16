package zhix.encoding.spi;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

public class _9527Charset extends Charset {

  private Charset delegate = StandardCharsets.UTF_8;

  public _9527Charset() {
    super("9527", new String[] {"mew-9527", "mew"});
  }

  public boolean contains(Charset cs) {
    return delegate.contains(cs);
  }

  public CharsetDecoder newDecoder() {
    return delegate.newDecoder();
  }

  public CharsetEncoder newEncoder() {
    return delegate.newEncoder();
  }
}
