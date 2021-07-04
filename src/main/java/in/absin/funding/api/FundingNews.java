package in.absin.funding.api;

import in.absin.funding.model.AudioFile;
import in.absin.funding.model.NewsArticle;
import in.absin.funding.model.NewsSource;
import in.absin.funding.model.VideoFile;
import in.absin.funding.model.VideoFileAssets;
import in.absin.funding.model.YoutubeVideo;

public interface FundingNews {
	public AudioFile generateAudioFile(NewsArticle newsArticle);

	public VideoFileAssets generateVideoFileAssets(NewsArticle newsArticle);

	public VideoFile generateVideoFromAudioAndAssets(AudioFile audioFile, VideoFileAssets videoFileAssets);

	public YoutubeVideo upiloadVideoFileToYoutube(VideoFile videoFile);

	public NewsArticle generateNewsArticle(NewsSource newsSource);
}
