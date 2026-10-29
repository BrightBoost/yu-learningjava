# Your GitHub, your story 🚀

## Your mission

Turn the top of your GitHub profile into a small personal homepage using **Markdown**. Show visitors who you are, what you are learning, and what you enjoy building. Give it some personality: your interests, your ambitions, your favourite terrible programming joke… your choice.

**Time:** approximately 60–90 minutes, plus optional challenges.

**What you will create:** a public GitHub profile README with text, images, links, tables, lists, code, and a few extra surprises.

You do not need years of experience or impressive projects. A small exercise you are proud of, a project idea, and an honest learning goal are perfect starting points.

## 1. Set up your profile README

1. Sign in to your personal GitHub account and find your **username**. This may be different from your display name.
2. Create a new repository with **exactly the same name as your username**. If your username is `coding-capybara`, your repository must also be named `coding-capybara`.
3. Make the repository **public** and initialise it with a `README.md` file.
4. Open `README.md` and edit it. You can work directly on GitHub or clone the repository and use your editor.
5. Replace the generated content with your own introduction, then commit your change.
6. Visit `https://github.com/YOUR-USERNAME` and check that your introduction appears.

Already have this repository? Improve the existing README instead of creating another one. Keep `README.md` in the root of the repository, outside any folders.

> Your profile README is public. Share only information you are happy for anyone to see. A nickname or illustration is fine; you do not need to share a photo, personal email address, or location.

If you use a managed school or company account and profile READMEs are unavailable, create a normal repository called `my-profile` and complete the exercise in its README instead.

## 2. Plan your personal homepage

Choose a style: clean and professional, colourful and playful, cosy and creative, or something completely different.

Include these sections, giving them your own titles:

- **A welcome:** your name or nickname and a short tagline.
- **About me:** a few sentences about your interests, background, or motivation.
- **My toolbox:** technologies you use or are learning.
- **Something I am building:** a project, exercise, or future idea.
- **My next steps:** your learning goals.
- **Beyond the keyboard:** a hobby, fun fact, or personal recommendation.

Write in your own words. The examples below demonstrate syntax; they are not a profile to copy unchanged.

## 3. Build your page with Markdown

Complete each task below. Use the **Preview** tab regularly to see what your Markdown looks like when rendered. Keep blank lines around headings, lists, tables, and code blocks.

### A. Create structure with headings and navigation

Use one level-one heading for your introduction, at least four level-two headings for sections, and at least one level-three heading for a subsection.

```markdown
# Hi, I am Alex 👋
## About me
## My toolbox
### Currently learning
```

Near the top, add a small navigation menu with links to at least three sections:

```markdown
[About me](#about-me) · [My toolbox](#my-toolbox) · [My next steps](#my-next-steps)
```

These are internal links. The example links work with those exact headings. If you change a heading, update its link too. GitHub heading links usually use lowercase letters and hyphens instead of spaces; simple headings make this easier.

### B. Give your introduction some emphasis

Include **bold**, *italic*, ~~strikethrough~~, and `inline code` somewhere meaningful.

```markdown
I am a **Java enthusiast** with a *slight* coffee dependency.
Currently learning `ArrayList` and ~~panicking~~ practising regularly.
```

Add at least two emojis. You can paste them directly or try GitHub codes such as `:wave:` and `:rocket:`.

### C. Add lists that tell your story

Include all three:

- An unordered list of at least three interests or skills.
- A numbered list of your top three learning priorities.
- A nested list with at least two items inside one main item.

```markdown
- Coding
  - Small Java games
  - Websites for imaginary businesses
- Cooking
- Hiking
```

Indent nested items consistently so they appear inside their parent item.

### D. Build a toolbox table

Create a table with at least three columns and four rows of content. Be honest about your experience: “just started” is a perfectly good level.

```markdown
| Technology | What I use it for | Confidence |
| :--- | :--- | :---: |
| Java | Console applications | Growing 🌱 |
| Git | Tracking changes | Practising |
| Markdown | Making this profile | Improving! |
| HTML | Structuring web pages | Just started |
```

The separator row is required. Colons control alignment: `:---` aligns left, `:---:` centres, and `---:` aligns right.

### E. Connect your profile to the world

Add at least two meaningful external links: for example, a repository, a useful learning resource, or a website related to your hobby.

```markdown
[Explore my repositories](https://github.com/YOUR-USERNAME?tab=repositories)
```

Use descriptive link text so visitors know where each link leads. Replace placeholders with real destinations and test your links.

### F. Add an image

Use at least one image: a drawing, banner, project screenshot, pet picture, or something that represents you.

1. Choose an image you made or have permission to use.
2. Add it to an `images` folder in your profile repository. A simple filename such as `my-banner.png` avoids problems with spaces.
3. Link to it from your README:

```markdown
![A hand-drawn capybara coding at a desk](images/my-banner.png)
```

Replace both the description and filename with your own. The description is **alt text**: it helps people understand the image if they cannot see it. Commit the image file as well as the README, and check the result on your actual profile.

### G. Show a little code

Include a short code snippet with a language label for syntax highlighting. Choose a language you know; the example uses Java.

````markdown
```java
System.out.println("Small steps still count as progress.");
```
````

The outer four-backtick fence above only lets this exercise display an example containing three backticks. In your README, use the inner three-backtick fences and your chosen language label.

### H. Add a quote and a divider

Include a blockquote containing your own motto or a short quote with credit. Separate two sections with a horizontal rule.

```markdown
> My debugging strategy: become slightly less wrong with every attempt.

---
```

### I. Make a learning checklist

Add at least four goals using task-list syntax. Include at least one completed goal and one future goal.

```markdown
- [x] Create my GitHub profile README
- [ ] Build a small Java application
- [ ] Learn to write useful tests
- [ ] Share a project I am proud of
```

Update the source from `[ ]` to `[x]` when you complete a goal.

### J. Hide a fun fact in a collapsible section

GitHub supports some HTML inside Markdown. Add a collapsible section using `<details>` and `<summary>`:

```html
<details>
<summary>A completely unnecessary fact about me</summary>

I have strong opinions about the correct shape of pasta.

</details>
```

Keep a blank line after `</summary>` and before `</details>` so the content inside can render correctly. Make the fact your own!

## 4. Pick your bonus challenges

Try at least two if you have time.

### A clickable image

Make a project screenshot link to its repository:

```markdown
[![Preview of my quiz application](images/quiz-preview.png)](https://github.com/YOUR-USERNAME/YOUR-REPOSITORY)
```

### A reference-style link

Define a link destination separately from the text that uses it:

```markdown
I keep my experiments on [my GitHub profile][profile].

[profile]: https://github.com/YOUR-USERNAME
```

### A footnote

Give a fun fact a small extra explanation:

```markdown
My best ideas usually arrive during a walk.[^ideas]

[^ideas]: Remembering them until I get home is a separate skill.
```

### A GitHub alert

Highlight something useful for visitors:

```markdown
> [!TIP]
> Start with my quiz project if you want to see what I am learning.
```

### A hidden comment

Leave a reminder in the source that will not appear on your rendered page:

```html
<!-- Future me: replace this project idea with a link when it is ready. -->
```

Comments are still visible to anyone reading the source. Do not put private information in them.

### Escape a special character

Use a backslash to display characters literally instead of applying formatting:

```markdown
Today I learned that \*these asterisks\* do not have to make text italic.
```

## 5. Polish, commit, and share

Your page should feel like an introduction to you, not a formatting catalogue. Keep sections short, use a consistent tone, and give images and tables enough space.

Before you finish:

- [ ] My README appears on my GitHub profile, or in the agreed alternative repository.
- [ ] I used heading levels 1, 2, and 3, plus internal navigation links.
- [ ] I used bold, italic, strikethrough, inline code, and emojis.
- [ ] I included unordered, ordered, and nested lists.
- [ ] My table has at least three columns and four content rows.
- [ ] My two external links work.
- [ ] My image loads and has meaningful alt text.
- [ ] My fenced code block has a language label.
- [ ] I included a blockquote, horizontal rule, and task list.
- [ ] My collapsible section opens and closes.
- [ ] I replaced example names, text, and URLs with my own.
- [ ] I checked both the Markdown source and the rendered profile.
- [ ] I committed my finished work with a meaningful message.

If working locally, push your commits to GitHub. If editing directly on GitHub, your committed changes are already there. Useful commit messages describe the change, such as `Add toolbox table and learning goals`.

**Share your profile URL:** `https://github.com/YOUR-USERNAME`.

Swap links with someone else. Tell them one thing you learned about them and suggest one improvement to the page. Fix any broken links or formatting you discover.

## Need a hand?

- **README missing from your profile?** Check the repository name, public visibility, and the location and spelling of `README.md`.
- **Image missing?** Check that the file is committed and that the path matches its filename, including capital letters.
- **Table looks like plain text?** Check the separator row and add a blank line before the table.
- **Everything looks like code?** You may have left a code fence open. Every opening fence needs a matching closing fence.
- **Section link goes nowhere?** Check that the link matches the heading. On GitHub, use the link icon beside the rendered heading to find its actual anchor.

Useful references:

- [GitHub: Managing your profile README](https://docs.github.com/en/account-and-profile/how-tos/profile-customization/managing-your-profile-readme)
- [GitHub: Basic writing and formatting syntax](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
- [GitHub: Organizing information with tables](https://docs.github.com/en/get-started/writing-on-github/working-with-advanced-formatting/organizing-information-with-tables)
- [GitHub: Organizing information with collapsed sections](https://docs.github.com/en/get-started/writing-on-github/working-with-advanced-formatting/organizing-information-with-collapsed-sections)

**Make it useful. Make it readable. Make it yours.**
