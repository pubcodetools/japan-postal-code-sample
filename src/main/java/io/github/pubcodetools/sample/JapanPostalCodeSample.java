package io.github.pubcodetools.sample;

import io.github.pubcodetools.japanPostalCode.JapanPostalCodes;
import io.github.pubcodetools.japanPostalCode.JapanPostalCode;

import java.util.List;

public class JapanPostalCodeSample {
    public static void main(String ...args) {
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
