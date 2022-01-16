package com.adjenti.lab.enumeration;

import javax.json.bind.annotation.JsonbTypeAdapter;

@JsonbTypeAdapter(PossibleValueAdapter.class)
public enum PossibleValue {
    Unknown,
    Charlie,
    Echo,
    Bravo


}
