public class CeaserCypher {
    public String cypher (String encryptionString, int key){
        String errorMessage = "";
        if (encryptionString.matches(".*\\d.*") && (key < 1 || key > 25)){
            errorMessage = "Enter letters only, and the key must between 1 and 25";
        } else if (encryptionString.matches(".*\\d.*")){
            errorMessage = "Enter letters only";
        } else if (key < 1 || key > 25){
            errorMessage = "The key must between 1 and 25";
        } else {
            String cypherText = "";
            int length = encryptionString.length();
            for (int i = 0; i < length; i++){
                char ch = encryptionString.charAt(i);
                if (Character.isLetter(ch)){
                    if (Character.isUpperCase(ch)) {
                        char c = (char)(ch + key);
                        if (c > 'Z'){
                            cypherText += (char)(ch - (26-key));
                        } else {
                            cypherText += c;
                        }
                    } else if (Character.isLowerCase(ch)){
                        char c = (char)(ch + key);
                        if (c > 'z'){
                            cypherText += (char)(ch - (26-key));
                        } else {
                            cypherText += c;
                        }
                    }
                }
                else {
                    cypherText += ch;
                }
            }
            return cypherText;
        }
        return errorMessage;
    }
    public String decypher (String encryptionString, int key){
        String errorMessage = "";
        if (encryptionString.matches(".*\\d.*") && (key < 1 || key > 25)){
            errorMessage = "Enter letters only, and the key must between 1 and 25";
        } else if (encryptionString.matches(".*\\d.*")){
            errorMessage = "Enter letters only";
        } else if (key < 1 || key > 25){
            errorMessage = "The key must between 1 and 25";
        } else {
            String cypherText = "";
            int length = encryptionString.length();
            for (int i = 0; i < length; i++){
                char ch = encryptionString.charAt(i);
                if (Character.isLetter(ch)){
                    if (Character.isUpperCase(ch)) {
                        char c = (char)(ch - key);
                        if (c < 'A'){
                            cypherText += (char)(ch + (26-key));
                        } else {
                            cypherText += c;
                        }
                    } else if (Character.isLowerCase(ch)){
                        char c = (char)(ch - key);
                        if (c < 'a'){
                            cypherText += (char)(ch + (26-key));
                        } else {
                            cypherText += c;
                        }
                    }
                }
                else {
                    cypherText += ch;
                }
            }
            return cypherText;
        }
        return errorMessage;
    }
}