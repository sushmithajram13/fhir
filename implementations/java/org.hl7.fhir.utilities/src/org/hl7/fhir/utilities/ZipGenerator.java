/*
Copyright (c) 2011-2012, HL7, Inc
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice, this 
   list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, 
   this list of conditions and the following disclaimer in the documentation 
   and/or other materials provided with the distribution.
 * Neither the name of HL7 nor the names of its contributors may be used to 
   endorse or promote products derived from this software without specific 
   prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.

*/
package org.hl7.fhir.utilities;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipGenerator {

  FileOutputStream dest;
  ZipOutputStream out;
  
  public ZipGenerator(String filename) throws Exception {
    dest = new FileOutputStream(filename);
    out = new ZipOutputStream(new BufferedOutputStream(dest));
  
  }

  public void close() throws Exception {
    out.close();
  }
  
  static final int BUFFER = 2048;

  public void addFiles(String actualDir, String statedDir, String ext) throws Exception {
    byte data[] = new byte[BUFFER];
    File f = new File(actualDir);
    String files[] = f.list();
    for (int i=0; i < files.length; i++) {
      if ((ext == null && new File(actualDir+files[i]).isFile()) || (ext != null && files[i].endsWith(ext))) {
        FileInputStream fi = new FileInputStream(actualDir+files[i]);
        BufferedInputStream origin = new BufferedInputStream(fi, BUFFER);
        ZipEntry entry = new ZipEntry(statedDir+files[i]);
        out.putNextEntry(entry);
        int count;
        while((count = origin.read(data, 0, BUFFER)) != -1) {
          out.write(data, 0, count);
        }
      }
    }
  }

  public void addFileSource(String path, String cnt) throws Exception {
    File tmp = File.createTempFile("tmp", ".tmp");
    TextFile.stringToFile(cnt, tmp.getAbsolutePath());
    addFileName(path, tmp.getAbsolutePath());
    tmp.delete();
  }

  public void addFileName(String statedPath, String actualPath) throws Exception {
    byte data[] = new byte[BUFFER];
    FileInputStream fi = new FileInputStream(actualPath);
    BufferedInputStream origin = new BufferedInputStream(fi, BUFFER);
    ZipEntry entry = new ZipEntry(statedPath);
    out.putNextEntry(entry);
    int count;
    while((count = origin.read(data, 0, BUFFER)) != -1) {
      out.write(data, 0, count);
    }
  }
  
}
