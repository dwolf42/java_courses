package dwolf.json_in_java;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

class JSONExercises {

    public static void main(String[] args) {
        createJSONFromJSONObject();
        createJSONFromMap();
        createJSONObjectFromJSONString();


    }

    static void createJSONFromJSONObject() {
        JSONObject jo = new JSONObject();
        jo.put("name", "David Wolf");
        jo.put("age", "38");
        jo.put("city", "Karlsruhe");
        printIt(jo);

    }

    static void createJSONFromMap() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Wolf, David");
        map.put("age", "21");
        map.put("city", "Carlsruhe");
        printIt(map);
        JSONObject jo = new JSONObject(map);
        printIt(jo);
    }

    static void createJSONObjectFromJSONString() {
        JSONObject jo = new JSONObject(
                "{\"name\":\"Leo\",\"age\":\"42\",\"city\":\"Rüppurr\"}"
        );
        printIt(jo);
    }

    static void printIt(JSONObject jo) {
        for (String i : jo.keySet()) {
            System.out.println(jo.get(i));
        }
        System.out.println(jo + "\n");
    }

    static void printIt(Map<String, String> map) {
        for (String i : map.keySet()) {
            System.out.println(map.get(i));
        }
        System.out.println(map + "\n");
    }

}