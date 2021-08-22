package r41nb0w;

import java.util.Scanner;

public class Main {
    String r41nb0wTellrawJSONMessageString;

    final String jsonArrayPrefixString = "[", jsonObjectPrefixString = "{", jsonArraySuffixString = "]",
            jsonObjectSuffixString = "}", QuotationMark = "\"", CommaMark = ",", ColonMark = ":";
    String[] r41nb0wC010rs = { "#FF0000", "#FF7F00", "#FFFF00", "#00FF00", "#0000FF", "#4B0082", "#9400D3" };

    String wrapWithQuotationMark(String text) {
        return QuotationMark + text + QuotationMark;
    }

    String getR41nb0w3d(String text) {
        String r41nb0w3dMsg = "";
        for (int i = 0; i < r41nb0wC010rs.length; i++) {
            r41nb0w3dMsg += (i == 0 ? jsonArrayPrefixString : "") + jsonObjectPrefixString
                    + wrapWithQuotationMark("text") + ColonMark
                    + wrapWithQuotationMark(text.substring((text.length() / r41nb0wC010rs.length) * i,
                            ((i == r41nb0wC010rs.length) ? text.length()
                                    : ((text.length() / r41nb0wC010rs.length) * (i + 1)))))
                    + CommaMark + wrapWithQuotationMark("color") + ColonMark + wrapWithQuotationMark(r41nb0wC010rs[i])
                    + jsonObjectSuffixString + (i == 6 ? jsonArraySuffixString : CommaMark);
        }

        return r41nb0w3dMsg;
    }

    Main() {
        r41nb0wTellrawJSONMessageString = getR41nb0w3d(new Scanner(System.in).nextLine());
        // System.out.println("L3t\'s R41nb0w");
        System.out.println(r41nb0wTellrawJSONMessageString);
    }

    public static void main(String[] args) {
        new Main();
    }
}