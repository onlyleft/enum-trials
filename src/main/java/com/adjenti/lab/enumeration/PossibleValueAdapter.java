package com.adjenti.lab.enumeration;

import javax.json.bind.adapter.JsonbAdapter;

public class PossibleValueAdapter implements JsonbAdapter<PossibleValue, String> {
    @Override
    public String adaptToJson(final PossibleValue s) {
        return s.name();
    }

    @Override
    public PossibleValue adaptFromJson(final String possibleValue) throws Exception {
        for (final PossibleValue value : PossibleValue.values()) {
            if (possibleValue.equalsIgnoreCase(value.name())) {
                return value;
            }
        }

        return PossibleValue.Unknown;
    }
}
