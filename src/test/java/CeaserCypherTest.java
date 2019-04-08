import org.junit.*;
import static org.junit.Assert.*;

public class CeaserCypherTest {
    @Test
    public void cypher_checkForNumbers_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = "Enter letters only";
        assertEquals(expectedOutput, testCeaserCypher.cypher("Dogs of berlin SN2", 2));
    }
    @Test
    public void cypher_checkValueOfKey_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = "The key must between 1 and 25";
        assertEquals(expectedOutput, testCeaserCypher.cypher("Dogs of berlin", 27));
    }
    // @Test
    // public void cypher_checkBothStringAndKey_String(){
    //     CeaserCypher testCeaserCypher = new CeaserCypher();
    //     String expectedOutput = "Enter letters only, and the key must between 1 and 25";
    //     assertEquals(expectedOutput, testCeaserCypher.cypher("Dogs of berlin sn2", 27));
    // }
    // @Test
    // public void cypher_checkEncryptionOfSingleLetter_String(){
    //     CeaserCypher testCeaserCypher = new CeaserCypher();
    //     String expectedOutput = "B";
    //     assertEquals(expectedOutput, testCeaserCypher.cypher("A", 1));
    // }
    // @Test
    // public void cypher_checkEncryptionOfAWord_String(){
    //     CeaserCypher testCeaserCypher = new CeaserCypher();
    //     String expectedOutput = "OJQTFZ";
    //     assertEquals(expectedOutput, testCeaserCypher.cypher("NIPSEY", 1));
    // }
    // @Test
    // public void cypher_checkCaseInsensitivity_String(){
    //     CeaserCypher testCeaserCypher = new CeaserCypher();
    //     String expectedOutput = "Ojqtfz";
    //     assertEquals(expectedOutput, testCeaserCypher.cypher("Nipsey", 1));
    // }
    // @Test
    // public void cypher_checkSentenceCypher_String(){
    //     CeaserCypher testCeaserCypher = new CeaserCypher();
    //     String expectedOutput = "Jv cxqebo txp jfppfkd Txo Iloa Lifsbo Kloqe";
    //     assertEquals(expectedOutput, testCeaserCypher.cypher("My father was missing War Lord Oliver North", 23));
    // }
    // @Test
    // public void cypher_testDecryption_String(){
    //     CeaserCypher testCeaserCypher = new CeaserCypher();
    //     String expectedOutput = "My father was missing War Lord Oliver North";
    //     assertEquals(expectedOutput, testCeaserCypher.decypher("Jv cxqebo txp jfppfkd Txo Iloa Lifsbo Kloqe", 23));
    // }
}