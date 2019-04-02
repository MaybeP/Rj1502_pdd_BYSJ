package top.maybe123.tool;

import java.net.URLEncoder;

public class TextInfo {
	static String  accessToken = Accesstoken.getAuth();
	public static String detect(byte[] imgData) {
		// 请求url
		String url = "https://aip.baidubce.com/rest/2.0/ocr/v1/general_basic";
		try {
			String imgStr = Base64Util.encode(imgData);
			String params = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8");
			String result = HttpUtil.post(url, accessToken, params);
			System.out.println(result);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
