
/**
 *
 * @author carlos
 */
import HashAlgorithm
import com.example.demo.response.Hash;
import com.example.demo.response.HashApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HashApi {
    @GetMapping("/api/hash")
    public HashApiResponse generateHash(@RequestParam(value = "algorithm", defaultValue = "md5") String algorithm,
                                        @RequestParam(value = "text", defaultValue = "") String text) {
        HashApiResponse response = new HashApiResponse();

        if (text.isEmpty()) {
            response.getHeader().setHttpStatusCode(400);
            response.getHeader().setHttpResponseMessage("Bad Request");
            response.getBody().setMessage("Error: text parameter is empty");
            return response;
        }

        if (algorithm.equalsIgnoreCase("md5")) {
            HashAlgorithm hash = new HashAlgorithm();
            String md5Hash = hash.generateMD5(text);

            Hash hashData = new Hash();
            hashData.setAlgorithm(algorithm);
            hashData.setText(text);
            hashData.setHash(md5Hash);

            response.getBody().setHash(hashData);
            response.getHeader().setHttpStatusCode(200);
            response.getHeader().setHttpResponseMessage("OK");
            return response;
        }

        response.getHeader().setHttpStatusCode(400);
        response.getHeader().setHttpResponseMessage("Bad Request");
        response.getBody().setMessage("Error: invalid algorithm parameter");
        return response;
    }
}