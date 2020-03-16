package zhix.encoding;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import zhix.encoding.spi._9527Charset;

@SuppressWarnings("InjectedReferences")
@Slf4j
public class _9527CharsetProviderTest {

  private String text = "我能吞下玻璃而不伤身体";
  private Charset charset;

  @Before
  public void setUp() {
    // 触发 SPI 查找
    charset = Charset.forName("9527");
  }

  @Test
  public void testEncodingAndDecoding() {

    log.info("Charset name = {}", charset.name());
    log.info("Charset displayName = {}", charset.displayName());
    log.info("Charset aliases = {}", charset.aliases());

    Assert.assertTrue(charset instanceof _9527Charset);
    Assert.assertEquals(text, new String(text.getBytes(charset)));
  }

  @Test
  public void testEncodingCompareToUTF8() {

    Charset utf8 = StandardCharsets.UTF_8;
    byte[] utf8Bytes = text.getBytes(utf8);
    byte[] _9527Bytes = text.getBytes(charset);

    Assert.assertTrue(charset instanceof _9527Charset);
    Assert.assertArrayEquals(utf8Bytes, _9527Bytes);
  }

  @Test
  public void testEncodingAndDecodingWithAlias() {

    charset = Charset.forName("mew");
    Assert.assertTrue(charset instanceof _9527Charset);
    Assert.assertEquals(text, new String(text.getBytes(charset)));
  }
}
