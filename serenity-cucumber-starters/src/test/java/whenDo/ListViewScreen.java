package whenDo;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class ListViewScreen {
    public static Target addTaskButton = Target.the("[+] button").located(By.id("com.vrproductiveapps.whendo:id/fab"));
    public static Target taskLabel = Target.the("[name task] label").located(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
    public static Target select = Target.the("[name item] label").located(By.id("com.vrproductiveapps.whendo:id/home_header_icon"));
    public static Target ComboSelect = Target.the("[name select] label").located(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Alphabetic\"]"));


}


