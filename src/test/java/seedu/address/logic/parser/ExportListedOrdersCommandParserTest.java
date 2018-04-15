//@@author A0143487X
package seedu.address.logic.parser;

import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
//import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.logic.parser.ExportListedOrdersCommandParser.MESSAGE_FILENAME_CONSTRAINTS;
//import static seedu.address.logic.parser.ExportListedOrdersCommandParser.MESSAGE_FILE_ALREADY_EXISTS;

//import java.io.File;

import org.junit.Test;

//import seedu.address.logic.commands.ExportListedOrdersCommand;

public class ExportListedOrdersCommandParserTest {

    private ExportListedOrdersCommandParser parser = new ExportListedOrdersCommandParser();

    /*
    @Test
    public void parse_validArgs_returnsExportListedOrdersCommand() {
        assertParseSuccess(parser, "aaa", new ExportListedOrdersCommand("aaa.csv"));
    }
    */

    @Test
    public void parse_invalidArgsWrongFormat_throwsParseException() {
        assertParseFailure(parser, "aaa!", MESSAGE_FILENAME_CONSTRAINTS);
    }

    @Test
    public void parse_invalidArgsTooLong_throwsParseException() {
        assertParseFailure(parser, "123451234512345123451234512345X", MESSAGE_FILENAME_CONSTRAINTS);
    }

    /*
    @Test
    public void parse_fileExists_throwsParseException() {
        String tempFilename = "aaa";
        File tempPath = new File(tempFilename + ".csv");
        assertParseFailure(parser, "aaa", MESSAGE_FILE_ALREADY_EXISTS);
        tempPath.delete();
    }
    */
}
