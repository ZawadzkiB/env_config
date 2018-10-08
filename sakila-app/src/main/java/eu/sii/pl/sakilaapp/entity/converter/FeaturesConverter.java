package eu.sii.pl.sakilaapp.entity.converter;

import eu.sii.pl.sakilaapp.enums.Features;
import org.springframework.util.StringUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.EnumSet;
import java.util.stream.Collectors;

@Converter
public class FeaturesConverter implements AttributeConverter<EnumSet<Features>, String> {

  public String convertToDatabaseColumn(EnumSet<Features> attribute) {
    return attribute.stream()
            .map(features -> features.toString().replaceAll("_"," "))
            .collect(Collectors.joining(","));
  }

  public EnumSet<Features> convertToEntityAttribute(String dbData) {
    if (dbData == null) {
      dbData = "";
    }
    EnumSet<Features> perm = EnumSet.noneOf(Features.class);
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

