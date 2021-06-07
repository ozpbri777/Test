package com.brt.recorder;

import com.sun.jna.Library;
import com.sun.jna.Native;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Arrays;

import com.sun.jna.StringArray;
import com.sun.jna.platform.mac.CoreFoundation;
import com.sun.jna.platform.win32.WinDef;

import java.nio.charset.StandardCharsets;

public class SwingModule {

  public interface ISwingModule extends Library {
    //copy dylib to root folder example ess-recorder
    ISwingModule INSTANCE = Native.load("libSwiftCode.dylib", ISwingModule.class);
    //your methods goes here
   // public String swiftGetString();
    public void   finalTest();
   // public Integer [] swiftHelloWorld();
  }

  public void printSwift() {
    //ISwingModule.INSTANCE.swiftHelloWorld();

   // String out = ISwingModule.INSTANCE.swiftGetString();
   // System.out.println("out returned " + out);
  //  Integer m = 5;
   // Integer int1 = ISwingModule.INSTANCE.swiftHelloWorld();
   // System.out.println("out returned " + int1);


      Timer t = new Timer();

      t.scheduleAtFixedRate(
      new TimerTask()
      {
        public void run()
        {
          new Thread(new Runnable() {
            @Override public void run() {
            ISwingModule.INSTANCE.finalTest();
          }
          }).start();
        }
      },
      0,      // run first occurrence immediately
      1);  // run every three seconds

  }
}
