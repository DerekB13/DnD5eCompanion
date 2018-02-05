package derek.disguisedsnowman.apps.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

import derek.disguisedsnowman.apps.main.character.PlayerRace;

public class CustomRaceFactory {

	public CustomRaceFactory() {
		
	}
	
	public Object newCustomRace(String name) throws IOException, ClassNotFoundException {
		File newClass = new File("main/derek/disguisedsnowman/apps/main/" + name + ".java");
		PrintWriter output = new PrintWriter(new FileWriter(newClass));
		output.println("import derek.disguisedsnowman.apps.main.character.PlayerRace;");
		output.println("");
		output.println("public class " + name + " extends PlayerRace{");
		output.println("\tprivate int num;");
		output.println("");
		output.println("\tpublic " + name + "(int n){");
		output.println("\t\tnum = n;");
		output.println("\t}");
		output.println("");
		output.println("\tpublic int getNum() { return num; }");
		output.println("}");
		
		output.close();
		
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		File parentDirectory = newClass.getParentFile();
		fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Arrays.asList(parentDirectory));
		Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromFiles(Arrays.asList(newClass));
		compiler.getTask(null, fileManager, null, null, null, compilationUnits).call();
		fileManager.close();
		
		
		URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { parentDirectory.toURI().toURL() });
		Class<?> newRace = classLoader.loadClass(name);
		
		System.out.println(newRace.getName());
			
		return newRace;
	}
}
