package ru.netology;

public class Radio {

    private int currentNumberOfStation;
    private int minNumberOfStation;
    private int maxNumberOfStation;
    private int currentSoundVolume;
    private int minSoundVolume;
    private int maxSoundVolume;
    
    // station
    
    public int getCurrentNumberOfStation() {
        return currentNumberOfStation;
    }

    public void setCurrentNumberOfStation(int currentNumberOfStation) {
    if (currentNumberOfStation > maxNumberOfStation) {
            return;
        }
        if (cNumberOfStation < minNumberOfStation) {
            return;
        }
        this.currentNumberOfStation = currentNumberOfStation;
    }
    
    public int getMinNumberOfStation() {
        return currentminNumberOfStation;
    }

    public void setMinNumberOfStation(int minNumberOfStation) {
        this.minNumberOfStation = minNumberOfStation;
    }
    
    public int getMaxNumberOfStation() {
        return maxNumberOfStation;
    }

    public void setMaxNumberOfStation(int maxNumberOfStation) {
        this.maxNumberOfStation = maxNumberOfStation;
    }
    
    public void next() {
        if (currentNumberOfStation == 0) {
            currentNumberOfStation = maxNumberOfStation;
        }
        if (currentNumberOfStation < maxNumberOfStation) {
            currentNumberOfStation = currentNumberOfStation + 1;
        } else {
            NumberOfStation = maxNumberOfStation;
        }
    }
    public void prev() {
        if (currentNumberOfStation > minNumberOfStation) {
            currentNumberOfStation = currentNumberOfStation - 1;
        } else {
            currentNumberOfStation = minNumberOfStation;
        }
        
    public void selectStation() {
        if (currentNumberOfStation > maxNumberOfStation) {
        return;}
        if (currentNumberOfStation < minNumberOfStation) {
        return;}
        this.currentNumberOfStation = currentNumberOfStation;
        }
    
    
    // volume
    
    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }
    
    public int getMinSoundVolume() {
        return currentminSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }
    
    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
            this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature == 0) {
            currentTemperature = maxTemperature;
        }
        if (currentTemperature < maxTemperature) {
            currentTemperature = currentTemperature + 1;
        } else {
            currentTemperature = maxTemperature;
        }
    }
    public void decreaseCurrentTemperature() {
        if (currentTemperature > minTemperature) {
            currentTemperature = currentTemperature - 1;
        } else {
            currentTemperature = minTemperature;
        }
    }
}
