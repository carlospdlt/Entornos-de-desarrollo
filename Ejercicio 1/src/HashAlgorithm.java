/**
 *
 * @author carlos
 */

import org.apache.commons.codec.digest.DigestUtils;

public class HashAlgorithm {
    public String generateMD5(String text) {
        return DigestUtils.md5Hex(text);
    }
}
