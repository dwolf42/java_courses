package dwolf.file_operations.move_files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveFiles {
	public static void main(String[] args) {
		moveReadModules();
	}

	private static void moveReadModules() {
		String sourceDir = "src/dwolf/file_operations/move_files/downloaded_files";
		String destDir = "src/dwolf/file_operations/move_files/archived_files";

		Path sourceDirPath = Paths.get(sourceDir);
		Path destDirPath = Paths.get(destDir);

		try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceDirPath)) {
			System.out.println("Start moving files");
			for (Path path : directoryStream) {
				Path fullDestDirFilePath = destDirPath.resolve(path.getFileName());
				Files.move(path, fullDestDirFilePath, StandardCopyOption.REPLACE_EXISTING);
			}
			System.out.println("Files moved successfully");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error while moving files");
		}
	}
}
