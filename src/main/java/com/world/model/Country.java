package com.world.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Country {

    @Id
    @Column(length = 3, name = "Code")
    String code;

    @Column(length = 52, nullable = false)
    String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    Continent continent;

    @Column(length = 26, nullable = false)
    String region;

    @Column(scale = 10,precision = 2,nullable = false)
    BigDecimal surfaceArea;

    short indepYear;

    @Column(nullable = false)
    int population;

    @Column(scale = 3,precision = 1)
    BigDecimal lifeExpectancy;

    @Column(scale = 10,precision = 2)
    BigDecimal gnp;

    @Column(scale = 10,precision = 2)
    BigDecimal gnpold;

    @Column(length = 45, nullable = false)
    String localName;

    @Column(length = 45, nullable = false)
    String governmentForm;

    @Column(length = 60)
    String headOfState;

    int capital;

    @Column(length = 2,nullable = false)
    String code2;

    public Country() {
    }

    public Country(String code, String name, Continent continent, String region, BigDecimal surfaceArea, short indepYear, int population, BigDecimal lifeExpectancy, BigDecimal gnp, BigDecimal gnpold, String localName, String governmentForm, String headOfState, int capital, String code2) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.indepYear = indepYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.gnp = gnp;
        this.gnpold = gnpold;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.code2 = code2;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BigDecimal getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(BigDecimal surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public short getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(short indepYear) {
        this.indepYear = indepYear;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public BigDecimal getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(BigDecimal lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public BigDecimal getGnp() {
        return gnp;
    }

    public void setGnp(BigDecimal gnp) {
        this.gnp = gnp;
    }

    public BigDecimal getGnpold() {
        return gnpold;
    }

    public void setGnpold(BigDecimal gnpold) {
        this.gnpold = gnpold;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent=" + continent +
                ", region='" + region + '\'' + "\n......" +
                ", surfaceArea=" + surfaceArea +
                ", indepYear=" + indepYear +
                ", population=" + population + "\n......" +
                ", lifeExpectancy=" + lifeExpectancy +
                ", gnp=" + gnp +
                ", gnpold=" + gnpold +
                ", localName='" + localName + '\'' + "\n......" +
                ", governmentForm='" + governmentForm + '\'' +
                ", headOfState='" + headOfState + '\'' + "\n......" +
                ", capital=" + capital +
                ", code2='" + code2 + '\'' +
                '}';
    }
}
