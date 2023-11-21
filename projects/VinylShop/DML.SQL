
DROP TABLE IF EXISTS album;

CREATE TABLE album (
    albumId INT AUTO_INCREMENT,
    albumTitle VARCHAR(100) NOT NULL,
    label VARCHAR(50),
    releaseDate DATE,
    price DECIMAL(5,2),
    CONSTRAINT pk_album
        PRIMARY KEY (albumId)
);


DROP TABLE IF EXISTS song;
CREATE TABLE song (
    songId INT NOT NULL AUTO_INCREMENT,
    songTitle VARCHAR(100) NOT NULL,
    videoUrl VARCHAR(100),
    bandId INT NOT NULL,
    CONSTRAINT pk_song 
    	PRIMARY KEY (songId),
    CONSTRAINT fk_song_band 
    	FOREIGN KEY (bandID)
    	REFERENCES band(bandId)
);

DROP TABLE IF EXISTS songAlbum;
CREATE TABLE songAlbum (
    songId INT,
    albumId INT,
    CONSTRAINT pk_songAlbum 
    	PRIMARY KEY (songId, albumId),
    CONSTRAINT fk_songAlbum_song
    	FOREIGN KEY (songId)
    	REFERENCES song(songId),
    CONSTRAINT fk_songAlbum_album
    	FOREIGN KEY (albumId)
    	REFERENCES album(albumId)
);

-- Create Author table
CREATE TABLE Author (
    AuthorId INT PRIMARY KEY,
    FirstName VARCHAR(25),
    MiddleName VARCHAR(25),
    LastName VARCHAR(50),
    Gender CHAR(1),
    DateOfBirth DATETIME,
    DateOfDeath DATETIME
);

-- Create Book table
CREATE TABLE Book (
    BookId INT PRIMARY KEY,
    Title VARCHAR(100),
    PublicationDate DATETIME
);

-- Create Format table
CREATE TABLE Format (
    FormatId INT PRIMARY KEY,
    FormatName VARCHAR(12)
);

-- Create Genre table
CREATE TABLE Genre (
    GenreId INT PRIMARY KEY,
    GenreName VARCHAR(25)
);

-- Create AuthorBook table
CREATE TABLE AuthorBook (
    AuthorId INT,
    BookId INT,
    PRIMARY KEY (AuthorId, BookId),
    FOREIGN KEY (AuthorId) REFERENCES Author(AuthorId),
    FOREIGN KEY (BookId) REFERENCES Book(BookId)
);

-- Create BookFormat table
CREATE TABLE BookFormat (
    BookId INT,
    FormatId INT,
    PRIMARY KEY (BookId, FormatId),
    FOREIGN KEY (BookId) REFERENCES Book(BookId),
    FOREIGN KEY (FormatId) REFERENCES Format(FormatId)
);

-- Create BookGenre table
CREATE TABLE BookGenre (
    BookId INT,
    GenreId INT,
    PRIMARY KEY (BookId, GenreId),
    FOREIGN KEY (BookId) REFERENCES Book(BookId),
    FOREIGN KEY (GenreId) REFERENCES Genre(GenreId)
);

-- Create Price table
CREATE TABLE Price (
    BookId INT PRIMARY KEY,
    Price DOUBLE,
    QuantityOnHand INT,
    FOREIGN KEY (BookId) REFERENCES Book(BookId)
);


