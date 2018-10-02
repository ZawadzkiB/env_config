package eu.sii.pl.sakilaapp.converter;

import eu.sii.pl.sakilaapp.enums.Features;
import org.springframework.util.StringUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.EnumSet;

@Converter
public class FeaturesConverter implements AttributeConverter<EnumSet<Features>, String> {

  public String convertToDatabaseColumn(EnumSet<Features> attribute) {
    if(attribute==null){
      return "";
    }
    StringBuilder sb = new StringBuilder();
    for (Features c : attribute) {
      sb.append(c.toString().replaceAll("_"," ") + ",");
    }
    return sb.toString();
  }

  public EnumSet<Features> convertToEntityAttribute(String dbData) {
    if (dbData == null) {
      dbData = "";
    }
    EnumSet<Features> perm = EnumSet.allOf(Features.class);
    String[] persistencePermissions = dbData.replaceAll("\\s+", "_").toUpperCase().split(",");
    if (!StringUtils.isEmpty(StringUtils.trimAllWhitespace(dbData))) {
      try {
        for (String str : persistencePermissions) {
          perm.add(Features.valueOf(str));
        }
      } catch (IllegalArgumentException IAE) {
          throw new RuntimeException("INVALID_REQUEST");
      }
    }

    return perm;

  }
}

