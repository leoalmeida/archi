/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.reports;

import java.io.File;

import com.archimatetool.tests.TestUtils;



/**
 * Testing Data
 * 
 * @author Phillip Beauvoir
 */
@SuppressWarnings("nls")
public class TestData {

    public static File TESTDATA_FOLDER = TestUtils.getLocalBundleFolder("com.archimatetool.reports.tests", "testdata");
    public static File TEST_MODEL_FILE = new File(TESTDATA_FOLDER, "test.archimate");

}
