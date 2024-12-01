package Utilities;

import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bitacora {

    private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void registrar(Exception ex) {
        try {
            FileHandler fh = new FileHandler("bitacora.log", true);
            fh.setLevel(Level.SEVERE);
            log.addHandler(fh);
            //https://www.youtube.com/watch?v=O4JXLzqWJCY&list=PLxErEhSBHScGfYHUGKKa-yiWUmyq_XBrE&index=4
            log.setUseParentHandlers(false);
            //log.severe(ex.getMessage()+"****"+ex.getStackTrace().toString());
            log.log(Level.SEVERE, "{0}****{1}", new Object[]{ex.getMessage(), Arrays.toString(ex.getStackTrace())});
        } catch (Exception e) {
            //log.log(Level.SEVERE,"Problemas al intentar escribir la bitacora"+ex.getMessage());
            log.log(Level.SEVERE, "Problemas al intentar escribir la bitacora{0}", ex.getMessage());
        }
    }

}
