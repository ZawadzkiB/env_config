package eu.sii.pl.sakilaapp.converter;

import eu.sii.pl.sakilaapp.enums.Rating;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import static eu.sii.pl.sakilaapp.enums.Rating.*;

@Converter
public class RatingConverter implements AttributeConverter<Rating, String> {

  @Override
  public String convertToDatabaseColumn(Rating attribute) {
    switch (attribute) {
      case PG:
        return "PG";
      case PG13:
        return "PG-13";
      case NC17:
        return "NC-17";
      case G:
        return "G";
      case R:
        return "R";
      default:
        throw new IllegalArgumentException("Unknown" + attribute);
    }
  }

  @Override
  public Rating convertToEntityAttribute(String dbData) {
    switch (dbData) {
      case "G":
        return G;
      case "R":
        return R;
      case "PG":
        return PG;
      case "PG-13":
        return PG13;
      case "NC-17":
        return NC17;
      default:
        throw new IllegalArgumentException("Unknown" + dbData);
    }
  }
}
