import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.taskadapter.redmineapi.RedmineException;
import com.taskadapter.redmineapi.RedmineManager;
import com.taskadapter.redmineapi.RedmineManagerFactory;
import com.taskadapter.redmineapi.UserManager;
import com.taskadapter.redmineapi.bean.User;
import io.vavr.*;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import javax.jws.soap.SOAPBinding;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Main {



    private static String encodeValue(String value) throws UnsupportedEncodingException {
        return URLEncoder.encode(value, StandardCharsets.US_ASCII.toString());
    }

    private static String decodeValue(String value) throws UnsupportedEncodingException {
        return URLDecoder.decode(value, StandardCharsets.US_ASCII.toString());
    }


    public static void main(String[] args) throws UnsupportedEncodingException {

        TreeMap<String, Pair<String, String>> asd = new TreeMap<>();

        asd.put("123", Pair.of("asd", "zxc"));

        for (Map.Entry<String, Pair<String, String>> entry : asd.entrySet()) {
            String phone, name, surname;
            phone = entry.getKey();
            name = entry.getValue().getLeft();
            surname = entry.getValue().getRight();

            System.out.println("Nr tel: " + phone + " Imie: " + name + " Nazwisko: " + surname);
        }



//        String filename = "Żźćńąśłęó.pdf";
//        String name = "Stanisław Krawiec.pdf";
//
//        String encodedFilename = encodeValue(filename);
//        String encodedName = encodeValue(name);
//
//        System.err.println(encodedFilename);
//        System.err.println(decodeValue(encodedFilename));
//
//        System.err.println(encodedName);
//        System.err.println(decodeValue(encodedName));

//        ImmutableMap<String, String> asd = ImmutableMap.<String, String>builder()
//                .put("1", "1")
//                .put("2", "2")
//                .put("3", "3")
//                .put("4", "4")
//                .put("5", "5")
//                .put("6", "6")
//                .put("7", "7")
//                .put("8", "8")
//                .put("9", "9")
//                .put("10", "10")
//                .put("11", "11")
//                .put("12", "12")
//                .put("13", "13")
//                .put("14", "14")
//                .put("15", "15")
//                .build();
//
//
//        for (int i = 0; i < 10; ++i) {
//            ImmutableSet<String> strings = asd.keySet();
//            for (String s : strings) {
//                System.out.printf("%s ", s);
//            }
//            System.out.println();
//        }
//        Asd asd1 = new Asd();
//        System.out.println(asd1.getAsd());

//        String apikey = "535dcf8302f216a01ec1947e6af3798a0fb076ac";
//        String url = "http://10.7.1.23/redmine/";
//
//        RedmineManager manager = RedmineManagerFactory.createWithApiKey(url, apikey);
//
//        UserManager userManager = manager.getUserManager();
//
//        List<User> users = userManager.getUsers();
//
//
//       File file = new File("users_ml.txt");
//       PrintWriter printWriter = new PrintWriter(file, "UTF-8");
//
////        users.forEach(user -> printWriter.println(user.getFullName() + " : " + user.getApiKey()));
//
//        for (User user : users) {
//            String userUrl = url + "users/";
//            String suffix = ".json";
//
//            CloseableHttpClient aDefault = HttpClients.createDefault();
//
//            HttpGet get = new HttpGet(userUrl + user.getId() + suffix);
//            get.addHeader("X-Redmine-API-Key", "535dcf8302f216a01ec1947e6af3798a0fb076ac");
//
//            CloseableHttpResponse response = aDefault.execute(get);
//
//            HttpEntity entity = response.getEntity();
//
//            String s = EntityUtils.toString(entity);
//            JSONObject object = new JSONObject(s).getJSONObject("user");
//
//            printWriter.println(object.getString("firstname") + " " + object.getString("lastname") + " : " + object.getString("api_key"));
//
//        }
//
//        printWriter.close();
    }

}

