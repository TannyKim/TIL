import axios from "axios"; // axios 임포트해주기

function showMenuApi() {
  // api를 get 방식으로 받아오는 통신전용 메소드!
  const BASE_URL =
    "https://ws.audioscrobbler.com/2.0/?method=track.search&track=Believe&api_key=0ac1a7dea0fd97bcc5e0cb06a8871196&format=json";
  return axios.get(BASE_URL);
}

export { showMenuApi }; // export 시켜줘야 다른 동네(파일) 가서도 쓴다!
