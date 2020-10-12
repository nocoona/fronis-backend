package ch.fronis.model.entity.convert;

import ch.fronis.model.image.Image;
import java.util.Base64;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class Base64ImageConverter implements AttributeConverter<Image, byte[]> {
    private static String defaultBase64Png() {
        return "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAABDgAAAXoCAAAAAB9MiTIAAAACXBIWXMAAAs2AAALNgG/CNh6AAAAEXRFWHRUaXRsZQBQREYgQ3JlYXRvckFevCgAAAATdEVYdEF1dGhvcgBQREYgVG9vbHMgQUcbz3cwAAAALXpUWHREZXNjcmlwdGlvbgAACJnLKCkpsNLXLy8v1ytISdMtyc/PKdZLzs8FAG6fCPGXryy4AABujklEQVQYGezBW7Ol93Xd59+Y77t2H3AGCQIEIYIQaZKSLJt2qly5SKWSj5GvqbtcJWUnlTix7JKSyBITiUeJFAkQ4gGN7r3Wf46svXd3A2iAkGYUA6A5nkd/RETETBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUTEUBERMVRERAwVERFDRUT8hjOftCIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioj4DSc+aUVExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRH/2bGJ/6SKiIihIiJiqIiIGCoiIoaKiIihIiJiqIiIGNqJ+M+OiP+0ioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSI+s2wiPpOKiIihnfjMEhGfTUVExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ0VExFARETFUREQMFRERQ8VnlIiIz6ris0oiIj6bioiIoZ3PKBMRn1VFRMRQERExVEREDBUREUNFRMRQERExVEREDBUREUNFRMRQERExVEREDBUREUNFRMRQERExVEREDBUREUNFRMRQERExVEREDBUREUNFRMRQERExVEREDBUREUNFRMRQERExVEREDBUREUNFRMRQERExVEREDBUREUNFRMRQERExVEREDBUREUNFRMRQERExVEREDBUREUNFRMRQERExVEREDBUREUNF/KaQiPhsKOI3hEBEfCYU8RvCYCI+E3biN4WJ+IwoIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgqIiKGioiIoSIiYqiIiBgq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";
    }

    @Override
    public byte[] convertToDatabaseColumn(Image image) {
        var base64Png = defaultBase64Png();
        if (image != null && image.getData() != null) {
            base64Png = image.getData();
        }
        return Base64.getDecoder().decode(base64Png.replaceFirst("data:image/png;base64,", ""));
    }

    @Override
    public Image convertToEntityAttribute(byte[] dbData) {
        var base64Png =
                dbData == null
                        ? defaultBase64Png()
                        : "data:image/png;base64," + Base64.getEncoder().encodeToString(dbData);
        return Image.from(base64Png);
    }
}
