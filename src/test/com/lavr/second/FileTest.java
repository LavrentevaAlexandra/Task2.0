package test.com.lavr.second;

import com.lavr.second.entity.BulbCrop;
import com.lavr.second.entity.Vegetable;
import com.lavr.second.factory.FactoryMethodRunner;
import com.lavr.second.factory.ReaderFromFile;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by 123 on 09.10.2016.
 */
public class FileTest {

    @Test(expected = RuntimeException.class)
    public void checkFileAbsence(){
        final String FILE="wrong.txt";
        ReaderFromFile.readVegetables(FILE);
    }

    @Test
    public void checkParsing(){
        final String FILE="files\\WrongVegetables.txt";
        List<Vegetable> ingredientList= FactoryMethodRunner.createSalad(FILE);
        int actual=ingredientList.size();
        int expected=1;
        Assert.assertEquals(expected,actual,0.1);
    }

    @Test
    public void checkRightCreation(){
        final String FILE="files\\Onion.txt";
        List<Vegetable> ingredientList= FactoryMethodRunner.createSalad(FILE);
        if(ingredientList.size()==1){
            Assert.assertEquals("ONION",((BulbCrop)ingredientList.get(0)).getTypeOfBulbCropVegetable().toUpperCase());
        }
        else{
            Assert.fail();
        }
    }
    @Test
    public void checkWrongCreation(){
        final String FILE="files\\WrongOnion.txt";
        List<Vegetable> ingredientList= FactoryMethodRunner.createSalad(FILE);
        int actual=ingredientList.size();
        int expected=0;
        Assert.assertEquals(expected,actual,0.1);
    }
}
