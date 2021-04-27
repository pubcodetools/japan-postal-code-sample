package io.github.pubcodetools.sample;

import io.github.pubcodetools.japanpostalcode.JapanPostalCode;
import io.github.pubcodetools.japanpostalcode.JapanPostalCodes;
import java.util.List;

public class JapanPostalCodeSample {
  /**
   * Sample application main.
   * @param args List of String
   */
  public static void main(String... args) {
    JapanPostalCodes jpcs = new JapanPostalCodes();

    {
      JapanPostalCode jpc = jpcs.get("0600000");
      System.out.println(jpc.getPostalCode());
      System.out.println(jpc.getPrefecture());
      System.out.println(jpc.getCity());
      System.out.println(jpc.getStreet());
    }

    {
      List<JapanPostalCode> jpcList = jpcs.getAll();
      for (JapanPostalCode jpc : jpcList) {
        System.out.println(jpc.toString());
      }
    }

    {
      String version = jpcs.getVersion();
      System.out.println(version);
    }
  }
}
