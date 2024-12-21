-- Create the questionnaires table
CREATE TABLE questionnaires (
                                id INT PRIMARY KEY,
                                title VARCHAR(255),
                                description TEXT,
                                estimatedTimeOfCompletion VARCHAR(50),
                                assignedAt TIMESTAMP,
                                isFinished BOOLEAN
);

-- Insert the data into the questionnaires table
INSERT INTO questionnaires (id, title, description, estimatedTimeOfCompletion, assignedAt, isFinished) VALUES
                                                                                                           ('1', 'Questionnaire 1', 'Description 1', '30 minutes', '2023-01-01T00:00:00Z', false),
                                                                                                           ('2', 'Questionnaire 2', 'Description 2', '45 minutes', '2023-02-01T00:00:00Z', true),
                                                                                                           ('3', 'Questionnaire 3', 'Description 3', '60 minutes', '2023-03-01T00:00:00Z', false);
