package rocks.blackcat.vcl;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;


public class VCLFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(VCLFileType.INSTANCE, "VCL");
    }
}