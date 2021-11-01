import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Nicola Anghileri
 * @version  20.10.2021
 */
public class ClassReader {

    /**
     *
     */
    private Class subject;

    /**
     * 
     * @param path
     * @throws ClassNotFoundException 
     */
    public ClassReader(String path) throws ClassNotFoundException{
        this.subject = Class.forName(path);
    }

    /**
     * 
     * @return 
     */
    public String getName(){
        return this.subject.getName();
    }
    
    

    /**
     * 
     * @return 
     */
    public List<String> getFullFunctions(){
        List<String> output = new ArrayList<>();
        
        for (var d: this.subject.getDeclaredMethods()) {
            StringBuilder line = new StringBuilder();
            
            line.append(Modifier.toString(d.getModifiers()));
            line.append(" ").append(d.getName()).append("(");
            Parameter[] params = d.getParameters();
            for(var p : params){
                line.append(p.getType().getSimpleName());
                line.append(" ").append(p.getName()).append(" ");
            }
            line.append(") \n");
            output.add(line.toString());
        }
        return output;
    }
    
    public List<String> getAllFields(){
        List<String> output = new ArrayList<>();
        StringBuilder line = new StringBuilder();
        for(var field : this.subject.getFields()){
           line.append(field.getType().getSimpleName());
           
           output.add(line.toString());
        }
        
        return output;
        
    }


}
