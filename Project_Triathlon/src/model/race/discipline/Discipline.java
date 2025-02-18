package model.race.discipline;

import model.athlete.PhysicalConditions;
import model.athlete.Athlete;
import model.race.Chronometer;
import model.race.Race;
import model.race.Stations;
import model.weather.WeatherConditions;

import javax.swing.*;
import java.io.Serializable;
import java.util.List;

public abstract class Discipline implements Serializable {

	//------------------------------------------------>||CLASS METHODS||<--------------------------------------------------------\\

	public abstract String time (String modality);
    public abstract boolean surpassed(int positionX, Race race, int startX, int endX);
    public abstract Discipline getNewDiscipline();
	public abstract Discipline createInstance();
    public abstract double getPoints(List<Double> disciplineChangePoints, Stations station, Race race, int startX, int endX);
    public abstract void setMaxTime(Race race, int time);
    public abstract double getBaseSpeed(PhysicalConditions stats, WeatherConditions wc);
    public abstract String setTime(Athlete athlete, Chronometer chronometer, int raceIndex);
    public abstract boolean isBeforePosition(int minutes, Race race);
    public abstract double getStat(PhysicalConditions stats);
    public abstract double getWeatherImpact(WeatherConditions wc);
    public abstract int getIconIndex();
    public abstract double getKmInDiscipline(Race race, int positionX, int startX, int endX);
    public abstract int getBaseIndex(int baseIndex);
    public String getTotalDistance(List<DisciplineDistance> disciplineDistances) {
        double totalDistance = 0.0;
        for (DisciplineDistance disciplineDistance : disciplineDistances)
            totalDistance += disciplineDistance.getDistance();
        return String.format("%.2f", totalDistance);
    }
}
