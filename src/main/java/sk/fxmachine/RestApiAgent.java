package sk.fxmachine;

public interface RestApiAgent {

    String sendGetRequest(String url);

    String sendPostRequest(String url, String jsonData);

}
